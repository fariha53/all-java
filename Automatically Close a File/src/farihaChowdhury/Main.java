
package farihaChowdhury;

import java.io.FileInputStream;

    public class Main {

        public static void main(String[] args) {
            // write your code here
            if(args.length!=1)
            {
                System.out.println("Usage: Autoclose file FileName");
                return;
            }
            int in;
            try(FileInputStream fileInput = new FileInputStream(args[0])) {

                do{
                    in = fileInput.read();
                    if(in!=-1)
                    {
                        System.out.println((char) in);
                    }
                }while(in!=-1);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
