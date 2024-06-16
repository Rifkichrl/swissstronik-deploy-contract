// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Register {
    string public github;
    address public owner;
    
    struct Referral {
        address referralAddress;
        string referralString;
    }
    
    Referral[] public referrals;
    
    constructor() {
        github = "Rifkichrl";
        owner = “0xFb5BC0f885dC7a2c7817Ed2b4b77f9D05853c7C8”;
    }
    
    function addReferral(address _referralAddress, string memory _referralString) external {
        require(msg.sender == owner, "Only the owner can add referrals.");
        referrals.push(Referral(_referralAddress, _referralString));
    }
    
    function totalReferrals() public view returns (uint256) {
        return referrals.length;
    }
}
