public class Array_TrappingRainwater {
    void calc(int height[],int width){
        int l=height.length;
        int[] leftboundary=new int[l];
        int[] rightboundary=new int[l];

        leftboundary[0]=height[0];
        for(int i=1;i<l;i++){
            leftboundary[i]=Math.max(leftboundary[i-1],height[i]);  
        }

        rightboundary[l-1]=height[l-1];
        for(int i=l-2;i>=0;i--){
            rightboundary[i]=Math.max(rightboundary[i+1],height[i]);
        }
        

        int wl,trappedwater=0;
        for(int j=0;j<l;j++){
            wl=Math.min(leftboundary[j],rightboundary[j]);
            trappedwater+=(wl-height[j])*width;
        }

        System.out.print("Volume is:"+trappedwater);
        
    }
    public static void main(String[] args) {
        int[] arr={4,2,0,6,3,2,5};
        Array_TrappingRainwater ob=new Array_TrappingRainwater();
        ob.calc(arr,1);
    }
}
