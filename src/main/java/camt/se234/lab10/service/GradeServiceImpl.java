package camt.se234.lab10.service;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
       if(score<=100 && score>=80){
           return "A";
       }else if(score<=78.9 && score>=75){
           return "B";
       }else if(score<=74.4 && score>=60){
           return "C";
       }else if(score<=59.4 && score>=33){
           return "D";
       }else if(score<=32 && score>=0){
           return "F";
       }
        return "F";
    }
}
