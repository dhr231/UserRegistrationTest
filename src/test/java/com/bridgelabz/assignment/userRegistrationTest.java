package com.bridgelabz.assignment;
//import org.junit.Assert;
import com.bridgelabz.assignment.userRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class userRegistrationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateFirstName("Daniel");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateFirstName("Aa");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenWithSplChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateFirstName("Dhruv_");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateFirstName("Hemant");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateFirstName("Aa");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenWithSplChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateFirstName("Sharma_");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePhone("91 9999999999");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePhone("91 9999");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenNoExtensionIncluded_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePhone("834867563");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenMoreChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePhone("91 8345843658676");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenWithSplChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePhone("+91 8873843875");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateEmail("dhr231@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenCorrectSymbolNotPresent_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateEmail("dhr231gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenLastTldShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateEmail("dhr231@gmail.com.co");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenDigitAlongWithTld_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateEmail("dhr231@gmail.com.2l");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenMultipleTld_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validateEmail("dhr231@gmail.com.co.in");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePassword("P@destrian13");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePassword("J_va13");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePassword("pede@trian13");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoSplChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePassword("Pedestrian13");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePassword("Pedes_trian");
        Assertions.assertFalse(result);
    }
}
