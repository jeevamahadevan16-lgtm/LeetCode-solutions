int reverse(int x){
 long rev=0;
while(x!=0){
    int rem=x%10;
    rev=rem+rev*10;
    if(INT_MIN>rev||rev>INT_MAX)
    return 0;
    x/=10;
}
return rev;
}