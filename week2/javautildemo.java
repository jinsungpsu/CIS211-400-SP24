int[] arr = new int[100];
        arr[49] = 99;

        Stack<Integer> myIntStack = new Stack<>();
        System.out.println("Adding 1-6 to the stack.");
        for (int i = 1; i < 7; i++) {
            myIntStack.push(i);
        }

        System.out.println("Peeking... 6 times.");
        for (int i = 1; i < 7; i++) {
            int peekedValue = myIntStack.peek();
            System.out.println(peekedValue);
        }

        System.out.println("Popping six times...");
        for (int i = 1; i < 7; i++) {
            int poppedValue = myIntStack.pop();
            System.out.println(poppedValue);
        }

        while(!myIntStack.isEmpty()) {
            int poppedValue = myIntStack.pop();
            System.out.println(poppedValue);
        }
