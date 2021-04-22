
package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.InsertionSort;

public class InsertionSort implements IIsertionSort{

    @Override
    public String[] InsertSort(String[] words, int a) {
        String temp = "";
        for(int i = 0; i < a; i++){
            for(int j = i + 1; j < a; j++){
                if(words[i].compareToIgnoreCase(words[j]) > 0){
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;        
    }
}
