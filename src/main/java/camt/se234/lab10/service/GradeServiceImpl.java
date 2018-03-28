package camt.se234.lab10.service;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
       if(score<=100 && score>=80){
           return "A";
       }else if(score<80 && score>=75){
           return "B";
       }else if(score<75 && score>=60){
           return "C";
       }else if(score<60 && score>=33){
           return "D";
       }else if(score<33 && score>=0){
           return "F";
       }
        return "Invalid";
    }
}
