class Checknumbers {
    static void checknumber(int n) {
        if (n > 0 ) {
            System.out.println("Positive number" + n);
        }
        else if (n < 0 ) {
            System.out.println("Negative number" + n);
        }
        else {
            System.out.println("Zero" + n);
        }
    }  
        public static void main(String[] args) {
            checknumber(144);
        
    }
}