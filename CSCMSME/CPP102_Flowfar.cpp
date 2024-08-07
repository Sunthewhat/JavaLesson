#include <bits/stdc++.h>
#include <vector>

class RiverNode {
    public:
        int id;
        std::vector<RiverNode> adj;

        RiverNode(int id) {
            this->id = id;
            this->adj = std::vector<RiverNode>();
        }

        void addAdj(RiverNode node) {
            this->adj.push_back(node);
        }

        int countAdj() {
            for (int i = 0; i < this->adj.size(); i++) {

            }
        }
};

int main() {
    return 0;
}
