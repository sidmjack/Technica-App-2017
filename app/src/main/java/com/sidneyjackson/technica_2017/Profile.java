package com.sidneyjackson.technica_2017;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sidneyjackson on 11/4/17.
 */

public class Profile {

    String firstName = "";
    String middleInitial = "";
    String lastName = "";

    String linkedInLink = "";
    String emailAddress = "";

    List<Education> educationHistory = new ArrayList<>();
    String areaOfInterest = "";

    boolean[] peerInterest = {false, false, false};

    String businessName = "";
    String businessArea = "";
    String missionStatement;

    String region = "";
    String country = "";

    List<String> areasOfMerit = new ArrayList<>();
    List<String> areasOfImprovement = new ArrayList<>();

    public class Education {
        String school = "";
        String discipline = "";
        String degree = "";
        int year = 0;
    }
}
