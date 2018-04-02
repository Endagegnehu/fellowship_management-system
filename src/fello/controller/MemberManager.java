package fello.controller;

import fello.pojo.Member;
import fello.model.Model;
import fello.pojo.Team;
import java.sql.SQLException;
public class MemberManager{
   Member member = new Member();
   Model model=Model.getInstance();
   Team team = new Team();
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
   
   String columns = "`frist_name`," +"`last_name`," +"`block_number`," +"`dorm_number`," +"`school`," +
                    "`program`,"+"`gender`," + "`year`,"+"`region`," +"`town`," +"`city`," +"`phone`," +"`e_mail`," +"`guardian_name`,"
                    +"`guardian_phone`," + "`guardian_type`," +"`church_name`," +"`church_pastor_name`," +"`church_pastor_phone`," +"`Department`";
   String userColumens= "`username`," +"`first name`," +"`last name`," +"`password`,"+"`team`";
   String tableMember = " `member` ";
   String tableBs = " bs ";
   String tableTeam= " team ";
   String tableMemberType= " member_type ";
   String tableUsers =" `users` ";
    public void register(Member member) throws SQLException{
                this.member = member;
                String Fristname = this.member.getFristname();
                String Lastname = this.member.getLastname();
                String BlockNumber = this.member.getBlockNumber();
                String DormNUmber = this.member.getDormNumber();
                String School =  this.member.getSchool();
                String Program =  this.member.getProgram();
                String gender =this.member.getGender();
                String year= this.member.getYear();
                String region = this.member.getRegion();
                String town = this.member.getTown();
                String city = this.member.getCity();
                String phone =  this.member.getPhone();
                String eMail =  this.member.geteMail();
                String guardianName =  this.member.getGuardianName();
                String guardianPhone = this.member.getGuardianPhone();
                String guardianType = this.member.getGuardianType();
                String churchName = this.member.getChurchName();
                String churchPasterName=   this.member.getChurchPasterName();
                String churchPasterPhone = this.member.getChurchPasterPhone();
                String department =  this.member.getDepartment();
                String bs = null;
                String memberid= null;
                String team= null;
                model.insert(tableMember, columns,"\""+Fristname+"\""+","+"\""+Lastname+"\""+","+"\""+BlockNumber+"\""+","+"\""+DormNUmber+"\""+","
                        +"\""+School+"\""+","+"\""+Program+"\""+","+"\""+gender+"\""+","+"\""+year+"\""+","+"\""+region+"\""+","+"\""+town+"\""+","
                        +"\""+city+"\""+","+"\""+phone+"\""+","+"\""+eMail+"\""+","+"\""+guardianName+"\""+","+"\""+guardianPhone+"\""+","+"\""
                        +guardianType+"\""+","+"\""+churchName+"\""+","+"\""+churchPasterName+"\""+","+"\""+churchPasterPhone+"\""+","+"\""+department+"\""+"");
               
    }
    public void registerUser(Member member ,Team team) throws SQLException{
        model.insert(tableUsers, userColumens,"\""+member.getUserName()+"\""+","+"\""+member.getFristname()+"\""+","+"\""+member.getLastname()+"\""+","+"\""+member.getPassword()+"\""+","
                        +"\""+team.getTeamName()+"\"" );
    }
    public void select() throws SQLException{
        String tafesse = "Tafesse";
        model.select(columns, tableMember, " `last_name`"+" = " +"\""+tafesse+"\"" );
    }
    
    public void update(Member member) throws SQLException{
        model.update(tableMember, "`frist_name`= " +"\""+member.getFristname()+"\""+"`last_name`=" +"\""+member.getLastname()+"\""+
                    "`block_number`=" +"\""+member.getBlockNumber()+"\""+"`dorm_number`=" +"\""+member.getDormNumber()+"\""+"`school`=" +"\""+member.getSchool()+"\""+
                    "`program`="+ "\""+member.getProgram()+"\""+"`gender`=" +"\""+member.getGender()+"\""+ "`year`="+"\""+member.getYear()+"\""+
                    "`region`=" +"\""+member.getRegion()+"\""+"`town`=" +"\""+member.getTown()+"\""+"`city`=" +"\""+member.getCity()+"\""+
                    "`phone`=" +"\""+member.getPhone()+"\""+"`e_mail`=" +"\""+member.geteMail()+"\""+"`guardian_name`="
                    + "\""+member.getGuardianName()+"\""+"`guardian_phone`=" +"\""+member.getGuardianPhone()+"\""+ "`guardian_type`=" +"\""+member.getGuardianType()+"\""
                    +"`church_name`=" +"\""+member.getChurchName()+"\""+"`church_pastor_name`=" +"\""+member.getChurchPasterName()+"\""+"`church_pastor_phone`=" +"\""+member.getChurchPasterPhone()+"\""
                    +"`Department`="+"\""+member.getDepartment()+"\""+"","");
    }
    public void loginSelectall(Member member)throws SQLException{
        model.loginSelectAll(tableUsers,member.getUserName(),member.getPassword());
    }
    public void selectAll() throws SQLException{
        model.selectAll(tableMember);
    }   
}
