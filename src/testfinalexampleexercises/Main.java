package testfinalexampleexercises;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        final double PI = 3.14;

        Emplyee emplyee = new Emplyee();
        System.out.println(emplyee.employmentDate);
    }
}

class Emplyee{

    Emplyee(){
        this.employmentDate = new Date();
    }

    Emplyee(Date date){
        this.employmentDate = date;
    }

    final Date employmentDate;

    final Date getEmploymentDate(){
        return this.employmentDate;
    }
}

class Programmer extends  Emplyee{
    Date getEmploymentDate(){
        return this.employmentDate;
    }
}