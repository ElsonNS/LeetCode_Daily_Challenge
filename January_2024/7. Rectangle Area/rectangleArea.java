class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int tot=(by2-by1)*(bx2-bx1) + (ay2-ay1)*(ax2-ax1);
        
        int[] iY=findIntersection(new int[]{ay1,ay2},new int[]{by1,by2});
        int[] iX=findIntersection(new int[]{ax1,ax2},new int[]{bx1,bx2});
        
        int common;
        
        if(iX==null || iY==null){
            common=0;
        }else{
            common=(iY[1]-iY[0])*(iX[1]-iX[0]);
        }
        
        return tot-common;
    }
    
    private int[] findIntersection(int[] a,int[] b){
        if(a[0]>b[0]){
            return findIntersection(b,a);
        }
        
        if(a[1]<b[0]){
            return null;
        }
        
        return new int[]{Math.max(a[0],b[0]),Math.min(a[1],b[1])};
    }
}