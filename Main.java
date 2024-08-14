class Main {
  public static void main(String[] args) {
    pow(200);
  }
  public static int pow(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(j*13==i*9) System.out.println("equal at A/B="+ i + "/" + j +" [" + j*13 + "]");
        if(j*13-i*9==1) System.out.println("13 will be 1 greater at A=" + j + " [" + j*13 + ", " + i*9 + ", B="+i +  "]");
        if(j*13-i*9==-1) System.out.println("9 will be 1 greater at B=" + i + " [" + j*13 + ", " + i*9 +", A="+j+ "]");
      }
    }
    return(n);
  }

}