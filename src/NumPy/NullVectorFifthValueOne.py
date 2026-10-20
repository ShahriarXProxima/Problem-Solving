import numpy as np


def solve() -> np.ndarray:
    array = np.array(np.full(9, 0, dtype=float))
    array = np.insert(array, 4, 1)

    return array
