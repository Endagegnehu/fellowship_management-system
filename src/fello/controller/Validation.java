package fello.controller;

import fello.pojo.Member;

public class Validation {
    public Validation( Member member){
        String validate[]={
            member.getFristname(),member.getLastname(),member.getBlockNumber(),
            member.getDormNumber(),member.getSchool(),member.getProgram(),
            member.getGender(),member.getYear(),member.getRegion(),
            member.getTown(),member.getCity(),member.getPhone(),
            member.getGuardianName(),member.getGuardianPhone(),
            member.getGuardianType(),member.getChurchName()
                          };
            for (int i = 0; i < 16; i++) {
            if ("".equals(validate[i])) {
                System.out.println("Pleas fill all the forms");
            }
            }
        }
    }


/*,member.getChurchPasterName(),
member.getChurchPasterPhone(),member.getDepartment()
member.getEmail()
*/