package home_work_6.api;

public class EasySearch implements ISearchEngine {

        String stopChars = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        public long search(String text, String word) {
            int index = -1;
            long count = 0;
            do {
                index = text.indexOf(word, index + 1);
                if (index != -1){
                    char before = text.charAt(index - 1);
                    char after = text.charAt(index + word.length());
                    int afterIndex = index + word.length();
                    if (afterIndex <= text.length()){
                        if(afterIndex == text.length()){
                            count++;
                            return count;
                        }
                    }
                    if (isStopChar(before) && isStopChar(after)){
                        count++;
                    }
                }
            } while(index != -1);
            return count;
        }

        private boolean isStopChar(char c){
            return stopChars.indexOf(c) != -1;
        }
}
