/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

//Classe que realiza o Merge Sort
public class MergeSort {

	public static void sort(long a[]) {
    if (a.length < 2)
        return;
    long []b = new long[a.length];
    MergeSortAtoA(a, b, 0, a.length);
}

private static void MergeSortAtoA(long a[], long b[], int ll, int ee)
{
    if (ee - ll > 1) {
        int rr = (ll + ee)>>1;          
        MergeSortAtoB(a, b, ll, rr);
        MergeSortAtoB(a, b, rr, ee);
        Merge(b, a, ll, rr, ee);        
    }
}

private static void MergeSortAtoB(long a[], long b[], int ll, int ee)
{
    if (ee - ll > 1) {
        int rr = (ll + ee)>>1;          
        MergeSortAtoA(a, b, ll, rr);
        MergeSortAtoA(a, b, rr, ee);
        Merge(a, b, ll, rr, ee);        
    } else if ((ee - ll) == 1) {
        b[ll] = a[ll];
    }
}

private static void Merge(long []a, long []b, int ll, int rr, int ee) {
    int o = ll;                         
    int l = ll;                        
    int r = rr;                        
    while(true){                        
        if(a[l] <= a[r]){              
            b[o++] = a[l++];           
            if(l < rr)                 
                continue;              
            while(r < ee){              
                b[o++] = a[r++];
            }
            break;                     
        } else {                        
            b[o++] = a[r++];            
            if(r < ee)                  
                continue;               
            while(l < rr){              
                b[o++] = a[l++];
            }
            break;                     
        }
    }
}
}