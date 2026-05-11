package Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Calculator {
    Long divide(Integer a, Integer b) throws IOException, SQLException, CustomCheckedException{
        Long ans = 0L;
        try{
            if(b!=0){
                ans = (long) (a/b);// Arithmetic Exception
            }
            if(b == 1){
                // Access an index out of array
                // if(st.isPresent())
                throw new ArrayIndexOutOfBoundsException("My custom message");
            }
            if(b == 2){
                throw new SQLException("My custom SQL message");
            }
            if(b == 3) {
                throw new IOException("My custom IO message");
            }
            if(b == 4){
                throw new CustomCheckedException();
            }
            if( b == 5){
                throw new CustomUncheckedException("My custom runtime exc");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            // retry logic every 10 secs - 3 times - after 3 times need to throw
            throw e;
        }catch (IOException e){
            //Some logic
            throw e;
        }
//        catch (RuntimeException e){
//
//        }
//        catch (Exception e){
//            // All exceptions get caught here
//            // Common handler
//        }

        return ans;
    }
}
//child exceptions
//.     |
//parent exceptions