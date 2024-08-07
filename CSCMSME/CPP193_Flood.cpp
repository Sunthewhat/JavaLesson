#include <bits/stdc++.h>

void dijkstra(int start_x, int start_y,
              std::vector<std::vector<std::pair<char, int>>>& field) {
    int size_x = field.size();
    int size_y = field[0].size();
    using pii = std::pair<int, std::pair<int, int>>;  // (steps, (x, y))
    std::priority_queue<pii, std::vector<pii>, std::greater<pii>> pq;
    pq.push({0, {start_x, start_y}});
    std::vector<std::vector<int>> dist(size_x,
                                       std::vector<int>(size_y, INT_MAX));
    dist[start_x][start_y] = 0;

    std::vector<std::pair<int, int>> directions = {
        {0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    while (!pq.empty()) {
        auto [v, coords] = pq.top();
        auto [x, y] = coords;
        pq.pop();

        if (field[x][y].second == -1) continue;  // Skip rocks
        if (v > dist[x][y]) continue;

        for (const auto& [dx, dy] : directions) {
            int nx = x + dx, ny = y + dy;
            if (nx >= 0 && nx < size_x && ny >= 0 && ny < size_y) {
                int newDist = v + 1;
                if (newDist < dist[nx][ny] && field[nx][ny].first != 'x') {
                    dist[nx][ny] = newDist;
                    pq.push({newDist, {nx, ny}});
                }
            }
        }
    }

    for (int i = 0; i < size_x; ++i) {
        for (int j = 0; j < size_y; ++j) {
            if (dist[i][j] == INT_MAX || field[i][j].second == -1) {
                std::cout << "x ";
            } else {
                std::cout << dist[i][j] << " ";
            }
        }
        std::cout << std::endl;
    }
}

int main() {
    int n, m;
    std::cin >> n >> m;
    std::vector<std::vector<std::pair<char, int>>> field(
        n, std::vector<std::pair<char, int>>(m));
    int start_x = -1, start_y = -1;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            char s;
            std::cin >> s;
            field[i][j].first = s;
            int value;
            switch (s) {
                case '.':
                    value = INT_MAX;
                    break;
                case 'x':
                    value = -1;
                    break;
                case 'w':
                    value = 0;
                    start_x = i;
                    start_y = j;
                    break;
                default:
                    value = INT_MAX;  // Default case for any other character
                    break;
            }
            field[i][j].second = value;
        }
    }

    if (start_x != -1 && start_y != -1) {
        dijkstra(start_x, start_y, field);
    }

    return 0;
}
