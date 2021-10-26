package home_work_6.api;

public class EasySearch implements ISearchEngine {
        String stopChars = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n";

        @Override
        public long search(String text, String word) {
            int wordLength = word.length();
            long textLength = text.length();
            int index = -1;
            long count = 0;
            do {
                index = text.indexOf(word, index + 1);
                if (index != -1){

                    if(index == 0){
                        count++;
                        break;
                    }

                    char before = text.charAt(index - 1);
                    int afterIndex = index + wordLength;

                    if (afterIndex <= textLength){
                        if(afterIndex == textLength){
                            count++;
                            break;
                        }
                    }

                    char after = text.charAt(index + wordLength);

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
