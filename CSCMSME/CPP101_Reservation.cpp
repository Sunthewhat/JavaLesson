#include <bits/stdc++.h>
using namespace std;

class Room {
   public:
    int id;
    int capacity;
    int time_to_wait;

    Room(int id, int capacity, int time_to_wait) {
        this->id = id;
        this->capacity = capacity;
        this->time_to_wait = time_to_wait;
    }

    bool operator<(const Room &other) const {
        if (this->capacity == other.capacity) {
            if (this->time_to_wait == other.time_to_wait) {
                return this->id < other.id;
            }
            return this->time_to_wait < other.time_to_wait;
        }
        return this->capacity < other.capacity;
    }
};

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int r, q;
    int min_cap = INT_MAX, max_cap = INT_MIN;
    cin >> r >> q;
    map<int, vector<Room>> rooms;
    for (int i = 0; i < r; i++) {
        int capacity;
        cin >> capacity;
        rooms[capacity].emplace_back(i + 1, capacity, 0);
        min_cap = min(min_cap, capacity);
        max_cap = max(max_cap, capacity);
    }

    while (q--) {
        int required_capacity, time;
        cin >> required_capacity >> time;
        int i = required_capacity;
        bool found = false;
        for (auto it = rooms.lower_bound(required_capacity); it != rooms.end();
             ++it) {
            if (!it->second.empty()) {
                found = true;
                auto &available_rooms = it->second;
                sort(available_rooms.begin(), available_rooms.end());
                Room &room = available_rooms.front();
                cout << room.id << " " << room.time_to_wait << "\n";
                room.time_to_wait += time;
                break;
            }
        }
        if (!found) {
            cout << "-1\n";
        }
    }

    return 0;
}
