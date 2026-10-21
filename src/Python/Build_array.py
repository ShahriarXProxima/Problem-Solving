class Solution:
    def buildArray(self, target: list[int], n: int) -> list[str]:
        stack_str = []
        stack_int = []

        for i in range(1, n + 1):
            if stack_int == target:
                break

            stack_int.append(i)
            stack_str.append("Push")
            if i not in target:
                stack_int.pop()
                stack_str.append("Pop")

        return stack_str
