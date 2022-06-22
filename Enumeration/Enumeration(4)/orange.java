public enum orange {
    
    SASHEN("PORGRAMMER",20),
    HASINDU("PHOTOGRAPHER",15),
    KAMAL("TEACHER",45),
    NIMAL("DRIVER",18),
    AJITH("DOCTOR",36),
    AMARA("ENGINEER",47);
    
    private final String DESE;
    private final int AGE;
    
    orange(String description,int year){
        DESE =  description; 
        AGE = year;
    }
    
    public String getDese(){
        return DESE;
    }
    
    public int getAge(){
        return AGE;
    }
    
}