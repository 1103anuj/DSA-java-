class Trie {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // INSERT
    public void insert(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';

            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }

            node = node.children[idx];
        }

        node.isEnd = true;
    }

    // SEARCH WORD
    public boolean search(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';

            if (node.children[idx] == null) {
                return false;
            }

            node = node.children[idx];
        }

        return node.isEnd;
    }

    // STARTS WITH PREFIX
    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';

            if (node.children[idx] == null) {
                return false;
            }

            node = node.children[idx];
        }

        return true;
    }
}
