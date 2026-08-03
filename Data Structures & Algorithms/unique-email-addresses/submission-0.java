class Solution {
    public int numUniqueEmails(String[] emails) {
        // @ 之前:遇到.:視為同一組email | 遇到+:+到@之前的數字都刪除
        // @之後:遇到.: 視為不同的email | 遇到+: 不會因為這樣刪除後面數字

        Set<String> count = new HashSet<>();
        for (String email : emails){
            String[] splitPart = email.split("@");
            String localPart = splitPart[0];
            String domainPart = splitPart[1];

            int plusIndex = localPart.indexOf('+');
            if (plusIndex != -1){
                localPart = localPart.substring(0,plusIndex);
            }
            localPart = localPart.replace(".","");
            String cleanedEmail = localPart + "@" + domainPart;
            count.add(cleanedEmail);
        }
        return count.size();

    }
}