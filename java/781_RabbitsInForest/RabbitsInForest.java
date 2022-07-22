class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int ret = 0;
        int j = 0;
        int i = 0;
        while (i < answers.length) {
            while (i < answers.length && answers[i] == answers[j]) {
                i++;
            }
            int num = i - j;
            int value = answers[j];
            int set = num / (value + 1);
            int remain = num % (value + 1);
            ret = ret + set * (value + 1) + (remain == 0 ? 0 : value + 1);
            j = i;
        }
        return ret;
    }
}
