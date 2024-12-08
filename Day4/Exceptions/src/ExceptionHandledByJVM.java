class ExceptionHandledByJVM {

    /**
     * 
     * @param arr
     * @param index
     * @return
     */
    // Method 1
    // This method throws ArrayIndexOutOfBoundsException if the index is out of bounds.
    static int accessArray(int[] arr, int index)
    {
        // This will cause ArrayIndexOutOfBoundsException if index is invalid
        int i = arr[index];
        return i;
    }

    /**
     *
     * @param arr
     * @param index
     * @return
     */
    // The JVM searches for an exception handler in this method, but it doesn't find one.
    // So, it looks up the call stack for a handler.
    static int handleArrayAccess(int[] arr, int index)
    {
        int res = 0;

        // Try block to check for exceptions
        try {
            res = accessArray(arr, index);
        }
        // Catch block for IllegalArgumentException, but it won't match ArrayIndexOutOfBoundsException
        catch (IllegalArgumentException ex) {
            // Message when IllegalArgumentException occurs
            System.out.println("IllegalArgumentException occurred");
        }

        return res;
    }

    // Method 2
    // The right exception handler is found here, i.e., for ArrayIndexOutOfBoundsException
    public static void main(String args[])
    {
        int[] arr = {1, 2, 3};
        int index = 5;

        // Try block to check for exceptions
        try {
            int i = handleArrayAccess(arr, index);
        }
        // Catch block for ArrayIndexOutOfBoundsException, this will handle the error
        catch (ArrayIndexOutOfBoundsException ex) {
            // Print the error message when exception occurs
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
