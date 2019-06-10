# -*- coding: utf-8 -*-

from functools import lru_cache


def mincostTickets( days, costs):
    dayset = set(days)
    duration = (1, 7, 30)

    @lru_cache(None)
    def dp(i):
        if i > 365:
            return 0
        elif i in dayset:
            return min(dp(i + d) + c for c, d in zip(costs, duration))
        else:
            return dp(i + 1)

    return dp(1)


print(mincostTickets([1, 4, 6, 7, 8, 20], [2, 7, 15]))
