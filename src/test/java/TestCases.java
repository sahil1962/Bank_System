import junit.framework.TestCase;

import java.io.File;

public class TestCases extends TestCase {

    public void testAdmin_CreateAccount_Test_1() {
        Admin A = new Admin();
        assertEquals(true, A.Admin_CreateAccount("71124543","63452789","Ahmed",
                "Ali", 23000,"20/21/2021","checking","6654"));
    }

    public void testAdmin_CreateAccount_Test_2() {
        Admin A = new Admin();
        assertEquals(false, A.Admin_CreateAccount("67234572", "56433789", "Abid",
                "Khalid", 23000, "20/21/2021", "saving", "6754"));
    }

    public void testAdmin_CheckZakat_Test_1() {
        Filehandling FH = new Filehandling();
        Admin A = new Admin();
        assertEquals(true, A.Admin_CheckZakat("24575687"));
    }

    public void testAdmin_CheckZakat_Test_2() {
        Filehandling FH = new Filehandling();
        Admin A = new Admin();
        assertEquals(false, A.Admin_CheckZakat("6723452"));
    }

    public void testAdmin_PrintStatement_Test_1() {
        Admin A = new Admin();
        assertEquals(true, A.Admin_PrintStatement("67234572"));

    }

    public void testAdmin_PrintStatement_Test_2() {
        Admin A = new Admin();
        assertEquals(false, A.Admin_PrintStatement("6723472"));

    }

    public void testAdmin_PrintDeduction_Test_1() {
        Admin A = new Admin();
        assertEquals(true, A.Admin_PrintDeduction("24575687"));
    }

    public void testAdmin_PrintDeduction_Test_2() {
        Admin A = new Admin();
        assertEquals(false, A.Admin_PrintDeduction("6723572"));
    }

    public void testAdmin_PrintDeduction_Test_3() {
        Admin A = new Admin();
        assertEquals(true, A.Admin_PrintDeduction("24575687"));
    }

    public void testAdmin_CalculateInterest_Test_1() {
        Admin A = new Admin();
        assertEquals(true, A.Admin_CalculateInterest("67234572"));
    }

    public void testAdmin_CalculateInterest_Test_2() {
        Admin A = new Admin();
        assertEquals(false, A.Admin_CalculateInterest("6724572"));
    }

    public void testAdmin_DeleteAccount_Test_1() {
        Admin A = new Admin();
        assertEquals(true, A.Admin_DeleteAccount("71124543", "63452789", "6654"));
    }

    public void testAdmin_DeleteAccount_Test_2() {
        Admin A = new Admin();
        assertEquals(false, A.Admin_DeleteAccount("6723572", "56433789", "6754"));
    }

    public void testAdmin_DeleteAccount_Test_3() {
        Admin A = new Admin();
        assertEquals(false, A.Admin_DeleteAccount("67234572", "5643389", "6754"));
    }

    public void testAdmin_DeleteAccount_Test_4() {
        Admin A = new Admin();
        assertEquals(false, A.Admin_DeleteAccount("67234572", "56433789", "6654"));
    }

    public void testUser_DepositeAmount_Test_1() {
        User U = new User();
        assertEquals(true, U.User_DepositeAmount("45379087", 50000));
    }

    public void testUser_DepositeAmount_Test_2() {
        User U = new User();
        assertEquals(false, U.User_DepositeAmount("4537907", 25000));
    }

    public void testUser_WithdrawAmount_Test_1() {
        User U = new User();
        assertEquals(true, U.User_WithdrawAmount("45379087", "3456", 2000));
    }

    public void testUser_WithdrawAmount_Test_2() {
        User U = new User();
        assertEquals(false, U.User_WithdrawAmount("45379087", "3456", 205500));
    }

    public void testUser_WithdrawAmount_Test_3() {
        User U = new User();
        assertEquals(false, U.User_WithdrawAmount("45379087", "4456", 2000));
    }

    public void testUser_WithdrawAmount_Test_4() {
        User U = new User();
        assertEquals(false, U.User_WithdrawAmount("12454436", "3456", 2000));
    }

    public void testUser_WithdrawAmount_Test_5() {
        User U = new User();
        assertEquals(false, U.User_WithdrawAmount("12454431", "3456", 2000));
    }

    public void testUser_CheckAmount_Test_1() {
        User U = new User();
        assertEquals(true, U.User_CheckAmount("45379087"));
    }

    public void testUser_CheckAmount_Test_2() {
        User U = new User();
        assertEquals(false, U.User_CheckAmount("4537987"));
    }

    public void testUser_TransferAmount_Test_1() {
        User U = new User();
        assertEquals(true, U.User_TransferAmount("45379087", "13467907", "3456", 5000));
    }

    public void testUser_TransferAmount_Test_2() {
        User U = new User();
        assertEquals(false, U.User_TransferAmount("4539087", "13467907", "3456", 5000));
    }

    public void testUser_TransferAmount_Test_3() {
        User U = new User();
        assertEquals(false, U.User_TransferAmount("45379087", "1346907", "3456", 5000));
    }

    public void testUser_TransferAmount_Test_4() {
        User U = new User();
        assertEquals(false, U.User_TransferAmount("45379087", "13467907", "7456", 5000));
    }

}

