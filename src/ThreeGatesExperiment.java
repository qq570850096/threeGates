

public class ThreeGatesExperiment{

    private int n;

    public ThreeGatesExperiment(int N){

        if(N<=0)
            throw new IllegalArgumentException("n must be larger than 0!");

        this.n=N;
    }

    public void run(boolean changeDoor){
        int wins=0;
        for(int i=0;i<n;i++){
            if(play(changeDoor))
                wins++;
            }
            System.out.println(changeDoor ? "change":"not change");
            System.out.println("winning rate"+(double)wins/n);
        
    }

    private boolean play(boolean changeDoor){
        //假设三门编号为0,1,2
        int prizedoor=(int)(Math.random()*3);
        int playerChoice=(int)(Math.random()*3);
        if(playerChoice==prizedoor)
            return changeDoor ? false:true;
        else
            return changeDoor?true:false; 
    }

    public static void main(String[] args) {
        int n=1000000;
        ThreeGatesExperiment gates=new ThreeGatesExperiment(n);

        gates.run(true);
        gates.run(false);

    }
}