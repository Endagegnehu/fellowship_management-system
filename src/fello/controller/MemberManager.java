package fello.controller;

import fello.pojo.Member;
import fello.model.Model;
import fello.pojo.Team;
import java.sql.SQLException;
public class MemberManager{
   Member member = new Member();
   Model model=Model.getInstance();
   Team team = new Team();
   
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
