/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emotional_identity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Treagle350
 */
public class QuizCases {
    ArrayList<String> problems = new ArrayList<>();
    List<List<String>> quizAnswers = new ArrayList<List<String>>();
    int count = 0;
    
    public QuizCases(){
        initCases();
    }
    
    public String getProblem(int page){
        String problem = problems.get(page);
        return problem;
    }
    
    public List getQuizAnswers(int page){
        List<String> quizPage = quizAnswers.get(page);
        return quizPage;
    }
    
    public int getQuizSize(){
        return problems.size();
    }
    
    private void addCase(String problem, String love, String submission, String awe, String disapproval, String remorse, String contempt, String aggression, String optimism){      
        problems.add(problem);
        quizAnswers.add(new ArrayList<String>());
        quizAnswers.get(count).add(love);
        quizAnswers.get(count).add(submission);
        quizAnswers.get(count).add(awe);
        quizAnswers.get(count).add(disapproval);
        quizAnswers.get(count).add(remorse);
        quizAnswers.get(count).add(contempt);
        quizAnswers.get(count).add(aggression);
        quizAnswers.get(count).add(optimism);
        count = count + 1;
    }
    private void initCases(){
        //Want to add extra problem cases ? This is the place to do that ! 
        //Feel free to add as many as you like, the rest of the code will adjust accordingly !
        String problem, love, submission, awe, disapproval, remorse, contempt, aggression, optimism;
        
        //Case 1 : Orientation case
        problem = "Pick the things you would prefer the most"; 
        love = "You have to let others help you";
        submission = "You have to let others decide your actions";
        awe = "You have to acknowledge a person as superior in skills"; 
        disapproval = "You have to turn your back on someone";
        remorse = "You have to reminisce over past mistakes"; 
        contempt = "You have to show you're better than someone else"; 
        aggression = "You have to contest someone's opinion"; 
        optimism = "You have to find the answers to a mystery";  
        addCase(problem, love, submission, awe, disapproval, remorse, contempt, aggression, optimism);
        
    }
    public ArrayList<String> getResults(int index){
        ArrayList<String> profile = new ArrayList<>();
        
        String answer = "";
        String description = "";
        String fear = "";
        
        switch(index){
            case 0:
                answer = "Love-centered : emotionally lives in a bubble.";
                description = "Preoccupies oneself mainly with their loved ones and nothing else.";
                fear = "Fears not hurting loved ones (Being in remorse).";
                break;
                
            case 1:
                answer = "Submission-centered : emotionally depends on others.";
                description = "Mainly concerned with getting in nobodies way.";
                fear = "Fears not being able to trust or depend on anyone (Being in contempt).";
                break;
                
            case 2:
                answer = "Awe-centered : emotionally hides behind others.";
                description = "The person distracts him/herself from reality by seeing it mainly as an avoidable obstacle.";
                fear = "Fears being confronted with no hopes of escape (Being in aggression).";
                break;
                
            case 3:
                answer = "Disapproval-centered : emotionally forsakes the world.";
                description = "While in the the state of refusal, one can ";
                fear = "Fears having to address the source for disapproval (Being in optimism).";
                break;
                
            case 4:
                answer = "Remorse-centered : emotionally denounces the world around him/her.";
                description = "In living in one's own regret, the person can loose track of where to go to.";
                fear = "Fears having to embrace the world the person denounces (Being in love).";
                break;
                
            case 5:
                answer = "Contempt-centered : emotionally lives in hatred.";
                description = "Seing everything around him/her as inferior, the person pushes everything else away that is seen as a threat.";
                fear = "Fears being dominated (Being in submission).";
                break;
                
            case 6:
                answer = "Aggressive-centered : emotionally never takes shelter from events in hopes of finding answers.";
                description = "Always in pursuit for answers, it ends up consuming themselves and others.";
                fear = "Fears being unprepared for something unforseenable (Being in awe).";
                break;
                
            case 7:
                answer = "Optimism-centered : emotionally lives in pursuit for the next big thrill to satisfy their intrests.";
                description = "Generally thrill seekers, their pursuit for answers can lead them to hedonism.";
                fear = "Fears losing hope (Being in disapproval).";
                break;
        }
        
        profile.add(answer);
        profile.add(description);
        profile.add(fear);
        
        return profile;
    }
}
