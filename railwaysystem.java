import java.util.*;
public class railwaysystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE Number of passengers");
        int n;
       
        // input
        double[]a=new double[10];
        String[]o=new String[10];
        double[]s=new double[10];
        String[]b=new String[10];
        String[]t=new String[10];
        double[]p=new double[10];
        String[]y=new String[10];
        String[]z=new String[10];
       //dffgrggbfggbrgbgbgbgbgrbrgbgfbngfnbf
        double[]u=new double[10];
        String[]f=new String[10];
        double[]x=new double[10];
        double[]l=new double[10];
        String[]q=new String[10];
        String[]d=new String[10];
        double[]e=new double[10];
        double[]g=new double[10];
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("ENTER THE Number of seat/berth for passenger"+(i+1));
            int c=sc.nextInt();
            //String Q=Integer.toString(c);
            //a[i]=new String(Q);
            //int we=a[i].length();
            //double c=sc.nextInt();
             //a[i]=new String(c);
            for(int j=0;j<c;j++){
                System.out.println("ENTER THE name of the passenger");
                o[j]=sc.next();
                System.out.println("ENTER THE age of the passenger");
                p[j]=sc.nextInt();
                System.out.println("ENTER THE gender of the passenger");
                System.out.println("Male/Female/T");
                t[j]=sc.next();
            }
            System.out.println("Enter the source");
            y[i]=sc.next();
            System.out.println("Enter the destination");
            z[i]=sc.next();
            System.out.println("Enter the Distance in Km");
            u[i]=sc.nextDouble();
            System.out.println("Enter the train number");
            s[i]=sc.nextInt();
            System.out.println("Enter the train name");
            f[i]=sc.next();
            System.out.println("Enter the Date of journey");
            q[i]=sc.next();
            System.out.println("Please mentioned the given type and coach as given below without bracket");
            System.out.println("Enter the train category");
            System.out.println("preminum(Rjdhani,shatabdi,duronto,Vande bharat),superfast(Humsuffar/ACExpress)");
            b[i]=sc.next();
            System.out.println("Enter The type of coach");
            System.out.println("3Tire ,2Tire, 1Tire, ACChairCar,Sitting(2s),ExecitiveChairCar,Vistadome,Anubhuti,Sleeper");
            d[i]=sc.next();
            String str1,str2,str4,str5,str6,str7,str8,str9,str10,str11,str12;
            str1="preminum";
            str2="superfast";
            str4="3Tire";
            str5="2Tire";
            str6="1Tire";
            str7="ACChairCar";
            str8="ExecitiveChairCar";
            str9="Vistadome";
            str10="Anubhuti";
            str11="Sleeper";
            str12="Sitting";
           if(b[i].equals(str1)){
                System.out.println("Want catering service 1) For yes 2)No");
                e[i]=sc.nextInt();
                if (d[i].equals(str4)){
                if(e[i]==1){
                        System.out.println("The dist in km"+u[i]);
                    if(100>u[i]&&u[i]<500){
                        System.out.println("1 for breakfast/Snaks for day");
                        System.out.println("2 for lunch/dinner for night");
                        g[i]=sc.nextInt();
                        if (g[i]==1){
                        l[i]=(c*60)+(c*1.5*u[i]);//for snaks
                        System.out.println("The fare is"+l[i]); 
                    }
                        else if(g[i]==2){

                        l[i]=c*140+(c*1.5*u[i]);//for dinner
                        System.out.println("The fare is"+l[i]);
                        }
                    }
                    else if(1000>u[i]&&u[i]>500){
                        l[i]=(c*200)+(c*1.5*u[i]);//for snaks and dinner
                        System.out.println("The fare is"+l[i]);
                    }
                    else if(2000>u[i]&&u[i]>1000){
                        l[i]=(c*260)+(c*1.5*u[i]);//for breakfast,snaks and dinner
                    }
                    else{
                        l[i]=(c*400)+(c*1.5*u[i]);//for breakfast,snaks,lunch and dinner
                    }
                }
                else{
                    l[i]=(c*1.5*u[i]);
                }
                
                }
                else if(d[i].equals(str5)) {
                if(e[i]==1){
                    System.out.println("The dist in km"+u[i]);
                    if(100>u[i]&&u[i]<500){
                        System.out.println("1 for breakfast/Snaks for day");
                        System.out.println("2 for lunch/dinner for night");
                        g[i]=sc.nextInt();
                        if (g[i]==1){
                        l[i]=(c*60)+(c*2.5*u[i]);//for snaks
                        System.out.println("The fare is"+l[i]); 
                    }
                        else if(g[i]==2){

                        l[i]=c*140+(c*2.5*u[i]);//for dinner
                        System.out.println("The fare is"+l[i]);
                        }
                    }
                    else if(1000>u[i]&&u[i]>500){
                        l[i]=(c*200)+(c*2.5*u[i]);//for snaks and dinner
                        System.out.println("The fare is"+l[i]);
                    }
                    else if(2000>u[i]&&u[i]>1000){
                        l[i]=(c*260)+(c*2.5*u[i]);//for breakfast,snaks and dinner
                    }
                    else{
                        l[i]=(c*400)+(c*2.5*u[i]);//for breakfast,snaks,lunch and dinner
                    }
                }
                else{
                    l[i]=(c*2.5*u[i]);
                }
                }
                else if(d[i].equals(str6)){
                if(e[i]==1){
                    System.out.println("The dist in km"+u[i]);
                    if(100>u[i]&&u[i]<500){
                        System.out.println("1 for breakfast/Snaks for day");
                        System.out.println("2 for lunch/dinner for night");
                        g[i]=sc.nextInt();
                        if (g[i]==1){
                        l[i]=(c*80)+(c*3.5*u[i]);//for snaks
                        System.out.println("The fare is"+l[i]); 
                    }
                        else if(g[i]==2){

                        l[i]=c*160+(c*3.25*u[i]);//for dinner
                        System.out.println("The fare is"+l[i]);
                        }
                    }
                    else if(1000>u[i]&&u[i]>500){
                        l[i]=(c*240)+(c*3.25*u[i]);//for snaks and dinner
                        System.out.println("The fare is"+l[i]);
                    }
                    else if(2000>u[i]&&u[i]>1000){
                        l[i]=(c*320)+(c*3.25*u[i]);//for breakfast,snaks and dinner
                    }
                    else{
                        l[i]=(c*500)+(c*3.25*u[i]);//for breakfast,snaks,lunch and dinner
                    }
                }
                else{
                    l[i]=(c*3.25*u[i]);
                }
             }
                else if(d[i].equals(str7)){
                if(e[i]==1){
                    System.out.println("The dist in km"+u[i]);
                    if(100>u[i]&&u[i]<500){
                        System.out.println("1 for breakfast/Snaks for day");
                        System.out.println("2 for lunch/dinner for night");
                        g[i]=sc.nextInt();
                        if (g[i]==1){
                        l[i]=(c*80)+(c*1.25*u[i]);//for snaks
                        System.out.println("The fare is"+l[i]); 
                    }
                        else if(g[i]==2){

                        l[i]=c*160+(c*1.25*u[i]);//for dinner
                        System.out.println("The fare is"+l[i]);
                        }
                    }
                    else if(1500>u[i]&&u[i]>500){
                        l[i]=(c*240)+(c*1.25*u[i]);//for snaks and dinner
                        System.out.println("The fare is"+l[i]);
                    }
                }
                else{
                    l[i]=(c*1.25*u[i]);
                }
                }
                else if(d[i].equals(str8)){
                if(e[i]==1){
                    System.out.println("The dist in km"+u[i]);
                    if(100>u[i]&&u[i]<500){
                        System.out.println("1 for breakfast/Snaks for day");
                        System.out.println("2 for lunch/dinner for night");
                        g[i]=sc.nextInt();
                        if (g[i]==1){
                        l[i]=(c*80)+(c*1.75*u[i]);//for snaks
                        System.out.println("The fare is"+l[i]); 
                    }
                        else if(g[i]==2){

                        l[i]=c*160+(c*1.75*u[i]);//for dinner
                        System.out.println("The fare is"+l[i]);
                        }
                    }
                    else if(1000>u[i]&&u[i]>500){
                        l[i]=(c*240)+(c*1.75*u[i]);//for snaks and dinner
                        System.out.println("The fare is"+l[i]);
                    }
                    
                }
                else{
                    l[i]=(c*1.75*u[i]);
                }
                }
            
                else if(d[i].equals(str9)){
                if(e[i]==1){
                    System.out.println("The dist in km"+u[i]);
                    if(100>u[i]&&u[i]<500){
                        System.out.println("1 for breakfast/Snaks for day");
                        System.out.println("2 for lunch/dinner for night");
                        g[i]=sc.nextInt();
                        if (g[i]==1){
                        l[i]=(c*80)+(c*2.75*u[i]);//for snaks
                        System.out.println("The fare is"+l[i]); 
                    }
                        else if(g[i]==2){

                        l[i]=c*160+(c*2.75*u[i]);//for dinner
                        System.out.println("The fare is"+l[i]);
                        }
                    }
                    else if(1000>u[i]&&u[i]>500){
                        l[i]=(c*240)+(c*2.75*u[i]);//for snaks and dinner
                        System.out.println("The fare is"+l[i]);
                    }
                    
                }
                else{
                    l[i]=(c*2.75*u[i]);
                }
                }
                else if(d[i].equals(str10)){
                    if(e[i]==1){
                        System.out.println("The dist in km"+u[i]);
                        if(100>u[i]&&u[i]<500){
                            System.out.println("1 for breakfast/Snaks for day");
                            System.out.println("2 for lunch/dinner for night");
                            g[i]=sc.nextInt();
                            if (g[i]==1){
                            l[i]=(c*80)+(c*2*u[i]);//for snaks
                            System.out.println("The fare is"+l[i]); 
                        }
                            else if(g[i]==2){
    
                            l[i]=c*160+(c*2*u[i]);//for dinner
                            System.out.println("The fare is"+l[i]);
                            }
                        }
                        else if(1000>u[i]&&u[i]>500){
                            l[i]=(c*240)+(c*2*u[i]);//for snaks and dinner
                            System.out.println("The fare is"+l[i]);
                        }
                        
                    }
                    else{
                        l[i]=(c*2*u[i]);
                    }
                }
                else if(d[i].equals(str11)){
                    if(e[i]==1){
                            System.out.println("The dist in km"+u[i]);
                            if(100>u[i]&&u[i]<500){
                                System.out.println("1 for breakfast/Snaks for day");
                                System.out.println("2 for lunch/dinner for night");
                                g[i]=sc.nextInt();
                                if (g[i]==1){
                                l[i]=(c*80)+(c*1.5*u[i]);//for snaks
                                System.out.println("The fare is"+l[i]); 
                            }
                                else if(g[i]==2){
        
                                l[i]=c*160+(c*1.5*u[i]);//for dinner
                                System.out.println("The fare is"+l[i]);
                                }
                            }
                            else if(1000>u[i]&&u[i]>500){
                                l[i]=(c*240)+(c*1.5*u[i]);//for snaks and dinner
                                System.out.println("The fare is"+l[i]);
                            }
                            
                        }
                        else{
                            l[i]=(c*1.5*u[i]);
                        }
                }
                else if(d[i].equals(str12)){
                    l[i]=(c*0.75*u[i]);
                }
            
            if(b[i].equals(str2)){
                if (d[i].equals(str4)){  
                    l[i]=(c*1.45*u[i]);
                }
                if (d[i].equals(str5)){  
                    l[i]=(c*2.00*u[i]);
                }
                if (d[i].equals(str6)){  
                    l[i]=(c*2.65*u[i]);
                }
                if (d[i].equals(str7)){  
                    l[i]=(c*1.25*u[i]);
                }
                if (d[i].equals(str11)){  
                    l[i]=(c*0.65*u[i]);
                }
                if (d[i].equals(str12)){  
                    l[i]=(c*0.45*u[i]);
                }

            }
            if(b[i].equals(str1)){
            if (d[i].equals(str4)){
                for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*10)+1);
                x[0]=(int)((Math.random()*65)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
        }
        if(d[i].equals(str5)){
            for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*5)+1);
                x[w]=(int)((Math.random()*55)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
        }
        if(d[i].equals(str6)){
            for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*1)+1);
                if(a[w]%2==0 && c>2){
                x[w]=(int)((Math.random()*4)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
                else if (c<2){
                x[w]=(int)((Math.random()*2)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
                }
            }
        }
        if(d[i].equals(str7)){
            for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*8)+1);
                x[w]=(int)((Math.random()*70)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
        }
        if(d[i].equals(str8)){
            for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*3)+1);
                x[w]=(int)((Math.random()*60)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
        }
        if(d[i].equals(str9)){
            for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*2)+1);
                x[w]=(int)((Math.random()*55)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
        }
        if(d[i].equals(str10)){
            for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*1)+1);
                x[w]=(int)((Math.random()*55)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
        }
        if(d[i].equals(str11)){
            for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*6)+1);
                x[w]=(int)((Math.random()*72)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
        }
        if(d[i].equals(str12)){
            for(int w=0;w<1;w++){
                a[w]=(int)((Math.random()*1)+1);
                x[w]=(int)((Math.random()*100)+1);
                for(int r=0;r<c-1;r++){
                    x[r+1]=x[r]+1;
                }
            }
        }
            }
        else if(b[i]==str2){
            if(d[i].equals(str4)){
                for(int w=0;w<1;w++){
                    a[w]=(int)((Math.random()*4)+1);
                    x[w]=(int)((Math.random()*70)+1);
                    for(int r=0;r<c-1;r++){
                        x[r+1]=x[r]+1;
                    }
                }
            }
            if(d[i].equals(str5)){
                for(int w=0;w<1;w++){
                    a[w]=(int)((Math.random()*3)+1);
                    x[w]=(int)((Math.random()*60)+1);
                    for(int r=0;r<c-1;r++){
                        x[r+1]=x[r]+1;
                    }
                }
            } 
            if(d[i].equals(str6)){
                for(int w=0;w<1;w++){
                    a[w]=(int)((Math.random()*1)+1);
                    if(a[w]%2==0 && c>2){
                    x[w]=(int)((Math.random()*4)+1);
                    for(int r=0;r<c-1;r++){
                        x[r+1]=x[r]+1;
                    }
                }
                    else if (c<2){
                    x[w]=(int)((Math.random()*2)+1);
                    for(int r=0;r<c-1;r++){
                        x[r+1]=x[r]+1;
                    }
                    }
                }
            }
            if(d[i].equals(str7)){
                for(int w=0;w<1;w++){
                    a[w]=(int)((Math.random()*3)+1);
                    x[w]=(int)((Math.random()*70)+1);
                    for(int r=0;r<c-1;r++){
                        x[r+1]=x[r]+1;
                    }
                }
            }
            if(d[i].equals(str9)){
                for(int w=0;w<1;w++){
                    a[w]=(int)((Math.random()*1)+1);
                    x[w]=(int)((Math.random()*55)+1);
                    for(int r=0;r<c-1;r++){
                        x[r+1]=x[r]+1;
                    }
                }
            }
            if(d[i].equals(str11)){
                for(int w=0;w<1;w++){
                    a[w]=(int)((Math.random()*10)+1);
                    x[w]=(int)((Math.random()*72)+1);
                    for(int r=0;r<c-1;r++){
                        x[r+1]=x[r]+1;
                    }
                }
            }
            if(d[i].equals(str12)){
                for(int w=0;w<1;w++){
                    a[w]=(int)((Math.random()*10)+1);
                    x[w]=(int)((Math.random()*108)+1);
                    for(int r=0;r<c-1;r++){
                        x[r+1]=x[r]+1;
                    }
                }
            }    
        }
            for(int r=0;r<c;r++){
                System.out.println("The Information of passenger"+(i+1));
                System.out.println("name" +o[r]);
                System.out.println("age" +p[r]);
                System.out.println("gender" +t[r]);
                if(d[i].equals(str4)){
                    System.out.println("Your seat is alloted");
                    System.out.println("B"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
                if(d[i].equals(str5)){
                    System.out.println("Your seat is alloted");
                    System.out.println("A"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
                if(d[i].equals(str6)){
                    System.out.println("Your seat is alloted");
                    System.out.println("H"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
                if(d[i].equals(str7)){
                    System.out.println("Your seat is alloted");
                    System.out.println("C"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
                if(d[i].equals(str8)){
                    System.out.println("Your seat is alloted");
                    System.out.println("EXC"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
                if(d[i].equals(str9)){
                    System.out.println("Your seat is alloted");
                    System.out.println("E"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
                if(d[i].equals(str10)){
                    System.out.println("Your seat is alloted");
                    System.out.println("ANU"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
                if(d[i].equals(str11)){
                    System.out.println("Your seat is alloted");
                    System.out.println("S"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
                if(d[i].equals(str12)){
                    System.out.println("Your seat is alloted");
                    System.out.println("D"+a[i]);
                    System.out.println("Seat"+x[r]);
                }
            }
            System.out.println("  Source  "+y[i]);
            System.out.println("  Destination  "+z[i]);
            System.out.println(" Distance "+u[i]+"KM");
            System.out.println(" Train no "+s[i]);
            System.out.println("  Train name "+f[i]);
            System.out.println("  Train Category "+b[i]);
            System.out.println("   Coach Type   "+d[i]);
            System.out.println("Date of journey is"+q[i]);
            System.out.println("Total fare is including gst "+l[i]);
            
        }
    }
    sc.close();
}

}
