import java.io.*;

class solution {
    public static void main(String args[])
    {

        // try-catch block to handle exceptions
        try {

            // Create a file object
            // /File f = new File("f:\\program");
            //File f = new File("/Users/ali/workdir/projects/java/tomcat_source/tomcat-8.0.9-sourcecode/webapps");
            File f = new File("/Users/ali/workdir/projects/java/examples");



            // Get all the names of the files present
            // in the given directory
            File[] files = f.listFiles();

            System.out.println("Files are:");

            // Display the names of the files
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
