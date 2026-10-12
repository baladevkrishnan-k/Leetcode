class Solution {
    public int removeDuplicates(int[] a) {
        int n=a.length;
        int p=a[0];
        int r=n;
        int c=1;
        int k=1;
        for(int i=1;i<n;i++){
            if(a[i]!=p){
                c=1;
                p=a[i];
                a[k]=p;
                k++;
               
            }
            else if(a[i]==p && c==2){
                r--;
            }
            else if(p==a[i] && c<2){
                c++;
                a[k++]=p;
            }
        }return r;
    }
}