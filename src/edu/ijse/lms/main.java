/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.lms;

import edu.ijse.lms.view.BookCategoryView;
import edu.ijse.lms.view.BookView;
import edu.ijse.lms.view.BorrowingView;
import edu.ijse.lms.view.LoginView;
import edu.ijse.lms.view.MemberView;
import edu.ijse.lms.view.ReturnView;

/**
 *
 * @author DELL
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  new LoginView().setVisible(true);
  //  new MemberView().setVisible(true);
  //     new BookView().setVisible(true);
         new BookCategoryView().setVisible(true);
          new BorrowingView().setVisible(true);
          new ReturnView().setVisible(true);
    }
    
}
