class Solution {
    public int totalMoney(int n) {
        int weekCount = n/7;
        int remainingDays = n % 7;

        //Contribution from complete weeks
        int total =((weekCount * (weekCount -1)) /2) * 7;
        //Contribution from complete weeks (addition on Mondays)
        total += weekCount *28;
        //Contribution from remaining Days
        total +=((remainingDays * (remainingDays + 1)) /2) +(weekCount * remainingDays);

        return total;
    }
}
