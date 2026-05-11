package Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {
        try{
            Calculator calc = new Calculator();
            Long ans = calc.divide(4,4);
            System.out.println("Ans : "+ ans);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {

        } catch (SQLException e) {

        } catch (CustomCheckedException e){
            System.out.println(e.getMessage());
        }
    }
}
