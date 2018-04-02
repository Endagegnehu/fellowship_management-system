package fello.controller;

import java.util.List;

public class TablePopulation {
   private static final int FRIST_NAME_COL=1;
   private static final int LAST_NAME_COL =2;
   private static final int BLOCK_NUM_COL=3;
   private static final int DORM_NUM_COL=4;
   private static final int SCHOOL_COL=5;
   private static final int PROGRAM_COL=6;
   private static final int GENDER_COL=7;
   private static final int YEAR_COL=8;
   private static final int REGION_COL=12;
   private static final int TOWN_COL=13;
   private static final int CITY_COL=14;
   private static final int PHONE_COL=15;
   private static final int EMAIL_COL=16;
   private static final int GNAME_COL=17;
   private static final int GPHONE_COL=18;
   private static final int GTYPE_COL=19;
   private static final int CNAME_COL=20;
   private static final int CPNAME_COL=21;
   private static final int CPPHONE_COL=22;
   private static final int  DEPARTMENT_COL=23;
   
   private String[] columnNames = {"Fristname","Lastname","BlockNumber","DormNumber"
   ,"School","Program","Gender","Year","Region","Town","City","phone","EMail","GuardianName",
   "GuardianPhone","GuardianType","ChurchName","ChurchPasterName","ChurchPasterPhone","Department"};
   private List<Members> menmer;
   
   public MemberManager(List<Member> member){
       member
   }
}
