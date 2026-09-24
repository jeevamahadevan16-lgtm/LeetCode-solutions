class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)=='C'){
                st.pop();
            }
            else if(arr[i].charAt(0)=='D'){
                int a=st.pop();
                st.push(a);
                st.push(a*2);
            }
            else if(arr[i].charAt(0)=='+'){
                int a=st.pop();
                int b=st.pop();
                int result=a+b;
                st.push(b);
                st.push(a);
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            int a=st.pop();
            sum+=a;
        }
return sum;
        
    }
}