package com.bridgelabz.assignment;
//import org.junit.Assert;
import com.bridgelabz.assignment.userRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class userRegistrationTest {
//    @Test
//    public void givenFirstName_whenProper_ShouldReturnTrue() throws exceptions {
//        userRegistration registrationForm = new userRegistration();
//        boolean result = registrationForm.validateFirstName("Daniel");
//        Assertions.assertTrue(result);
//    }

    @Test
    public void givenFirstName_whenShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validateFirstName("Aa");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.SHORT_INPUT, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenWithSplChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validateFirstName("Dhruv_");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

//    @Test
//    public void givenLastName_whenProper_ShouldReturnTrue() {
//        userRegistration registrationForm = new userRegistration();
//        boolean result = registrationForm.validateFirstName("Hemant");
//        Assertions.assertTrue(result);
//    }

    @Test
    public void givenLastName_whenShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validateFirstName("Aa");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.SHORT_INPUT, e.type);
        }
    }

    @Test
    public void givenLastName_WhenWithSplChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validateFirstName("Dhruv_");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
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
        try {
            registrationForm.validatePhone("9999");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenMobileNumber_WhenNoExtensionIncluded_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validatePhone("9999999999");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenMobileNumber_WhenMoreChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validatePhone("+91 99999999999");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenMobileNumber_WhenWithSplChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validatePhone("+91 999999@999");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
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
        try {
            registrationForm.validateEmail("dhr231gmail.com");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenEmailId_WhenLastTldShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validateEmail("dhr231@gmail.c");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenEmailId_WhenDigitAlongWithTld_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validateEmail("dhr231@gmail.1c");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenEmailId_WhenMultipleTld_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validateEmail("dhr@231gmail.com.co.in");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        userRegistration registrationForm = new userRegistration();
        boolean result = registrationForm.validatePassword("Pedestrian@1");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validatePassword("J@va1");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.SHORT_INPUT, e.type);
        }
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validatePassword("pedestrian@12");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenPassword_WhenNoSplChar_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validatePassword("Pedetrian12");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse()
    {
        userRegistration registrationForm = new userRegistration();
        try {
            registrationForm.validatePassword("Pedestrian@");
        }
        catch (exceptions e){
            Assertions.assertEquals(exceptions.exception.INVALID_INPUT, e.type);
        }
    }
}
