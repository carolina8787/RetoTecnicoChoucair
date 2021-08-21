package co.com.choucair.certification.proyectobase.model;

public class UTestData {
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String monthSelection = "April";
    private String birthDay;
    private String daySelection = "22";
    private String birthYear;
    private String yearSelection = "1996";
    private String languages;
    private String password;
    private String confirmPassword;

    public UTestData(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String languages, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.languages = languages;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getMonthSelection() {
        return monthSelection;
    }

    public void setMonthSelection(String monthSelection) {
        this.monthSelection = monthSelection;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getDaySelection() {
        return daySelection;
    }

    public void setDaySelection(String daySelection) {
        this.daySelection = daySelection;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getYearSelection() {
        return yearSelection;
    }

    public void setYearSelection(String yearSelection) {
        this.yearSelection = yearSelection;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}