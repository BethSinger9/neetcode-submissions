class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        new_list = []

        for i in range(len(words)):
            for j in range(len(words)):
                if i == j:
                    continue
                
                if words[i] in words[j]:
                    new_list.append(words[i])
                    break
        return new_list