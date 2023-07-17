
public class Main
{
	public static void main(String[] args) {
		
		//参加者別のサイズデータ
		int[] sizes = {0,0,0,0,0,0,0,0,0,0}; //player com1,com2,com3 etc...
		
		
		
		//10巡する
		for(int  i=0;i<10;i++){
		    //10人がそれぞれキャスト
		    for(int j=0;j<10;j++){
		        
		         int size = cast(j);//キャスト
		   //最大サイズ（個人）が否か確認
		            if(sizecheck(size,size[j])){
	        //最大サイズ更新（個人）
	                    size[j] = size;
	                        System.out.println("maxl");   
		
		}
		
		System.out.println("you got"+ size);
	}
	//優勝者を決定
	int max = 0;
	int winner = 0;
	for(int i=0;i<10;i++){
	    if(size[i]>max){
	        max = sizes[i];
	        winner = i;
	    }
	}
	//結果を出力
	System.out.println(winner+"won!(" +max+ ")");
	
	//キャスト関数
	public static int cast(int who){
	    
	    //釣れたか関数
	    int hit = new java.util.Random().nextint(10); //0-9の乱数
	    
	    //釣れなかった
	    if(hit < 7)return 0;
	    else{
	        //釣れた
	        int size = new java.util.Random().nextint(90);　//0-89の乱数
	        size += 10;
	        return size;
	    }     
	
	       
	 }
	 
	 //最大サイズチャック関数(個人)
	 public static boolean sizecheck(int now,int max){
	     if(now > max)return true;
	     else return false;
	 }
}//main
