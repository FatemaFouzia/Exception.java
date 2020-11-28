// Java program to demonstrate exception is thrown
// how the runTime system searches th call stack
// to find appropriate exception handler.
class Error{
        public static void main(String args[])
        {
            try {
                String a = "This is like chipping "; // length is 22
                char c = a.charAt(27); // accessing 25th element
                System.out.println(c);
            }
            catch(StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException");
            }

        }
    }



