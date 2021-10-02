package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
// To print boolean Array
public static List Maximum(int arr[], int n) {
int max=Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
if(arr[i]>max){
max=arr[i];
}
}
Listoutput=new ArrayList<>();
for (int i = 0; i < arr.length; i++) {
if(arr[i]+n>max){
output.add(true);
}
else {
output.add(false);
}
}
return output;
}
public static void main(String[] args) {
// write your code here
int arr[] = {2,5,3,4};
int n=2;
List result= Main.Maximum(arr,n);
System.out.println(result);
}
}
