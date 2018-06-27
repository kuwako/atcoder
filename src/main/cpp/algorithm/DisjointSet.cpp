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

    void makeSet(int x) {
        p[x] = x;
        rank[x] = 0;
    }

    bool same(int x, int y) {
        return findSet(x) == findSet(y);
    }

    void unit(int x, int y) {
        link(findSet(x), findSet(y));
    }

    void link(int x, int y) {
        if (rank[x] > rank[y]) {
            p[y] = x;
        } else {
            p[x] = y;
            if (rank[x] == rank[y]) {
                rank[y]++;
            }
        }
    }

    int findSet(int x) {
        if (x != p[x]) {
            p[x] = findSet(p[x]);
        }
        return p[x];
    }
};
