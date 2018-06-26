#include<iostream>
#include<vector>
using namespase std;

class DisjointSet {
    public: vector<int> rank, p;
    DisjointSet() {}
    DisjointSet(int size) {
        rank.resize(size, 0);
        p.resize(size, 0);
        for (int i = 0; i < n; ++i) makeSet(i);
    }
}
