package MockInterview.DSA1;

public class Mergeshort {
    public class Mergehort {
        {
            public static void merger(int[] arr,int start,int mid,int low)
            {
                int[] A=new int[start+low];
                int k=0;
                int i=0;
                int j=0;
                while (i<arr.length && j<arr.length)
                {
                    if(arr[i]>arr[j])
                    {
                        A[k]=arr[j];
                        j++;
                    }
                    else{
                        A[k]=arr[i];
                        i++;
                    }
                    k++;
                }
                System.out.println(Arrays.toString(A));

            }
            public static void partion(int[] arr,int start,int low)
            {
                int mid=start+(low-start)/2;
                partion(arr,start,mid);
                partion(arr,mid+1,low);
                merger(arr,start,mid,low);
            }
            public static void main(String[] args)
            {
                int[] arr={3,4,5,1,2,4};
                Partion(arr,0,arr.length-1);
            }
}
