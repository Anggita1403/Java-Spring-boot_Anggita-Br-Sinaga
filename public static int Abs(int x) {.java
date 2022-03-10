public static int Abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    public static int Min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int Frog(List<Integer> jumps) {
        var n = jumps.toArray().length;
        var dp = new int[n+1];

        dp[0] = 0;
        dp[1] = Abs(jumps.get(1) - jumps.get(0));

        for (var i = 2; i < n; i++) {
            var jump_1 = Abs(jumps.get(i)-jumps.get(i-1)) + dp[i-1];
            var jump_2 = Abs(jumps.get(i)-jumps.get(i-2)) + dp[i-2];
            dp[i] = Min(jump_1, jump_2);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(Frog(List.of(10, 30, 40, 20)));       // 30
        System.out.println(Frog(List.of(10, 10)));                 // 0
        System.out.println(Frog(List.of(30, 10, 60, 10, 60, 50))); // 40
    }
