<template>
  <div>
    <n-card
        content-style="padding-top: 0;padding-bottom: 0;"
        :bordered="false"
        size="small"
        class="mt-4"
    >
      <n-list>
        <n-list-item>
<!--          <template #prefix>-->
<!--&lt;!&ndash;            <n-avatar circle :size="40" :src="schoolboy"/>&ndash;&gt;-->
<!--&lt;!&ndash;          </template>&ndash;&gt;-->
          <n-thing title="Ah Jung 刚才把工作台页面随便写了一些，凑合能看了！">
<!--            <template #description-->
<!--            ><p class="text-xs text-gray-500">2021-07-04 22:37:16</p></template-->
<!--            >-->
          </n-thing>
        </n-list-item>
        <n-list-item>
<!--          <template #prefix>-->
<!--            <n-avatar circle :size="40" :src="schoolboy"/>-->
<!--          </template>-->
          <n-thing title="Ah Jung 在 开源组 创建了项目 naive-ui-admin？">
<!--            <template #description-->
<!--            ><p class="text-xs text-gray-500">2021-07-04 09:37:16</p></template-->
<!--            >-->
          </n-thing>
        </n-list-item>
<!--        <n-list-item>-->
<!--          <template #prefix>-->
<!--            <n-avatar circle :size="40" :src="schoolboy"/>-->
<!--          </template>-->
<!--          <n-thing title="@It界风清扬，向naive-ui-admin提交了一个bug，抽时间看看吧！">-->
<!--            <template #description-->
<!--            ><p class="text-xs text-gray-500">2021-07-04 22:37:16</p></template-->
<!--            >-->
<!--          </n-thing>-->
<!--        </n-list-item>-->
<!--        <n-list-item>-->
<!--          <template #prefix>-->
<!--            <n-avatar circle :size="40" :src="schoolboy"/>-->
<!--          </template>-->
<!--          <n-thing title="技术部那几位童鞋，再次警告，不要摸鱼，不要摸鱼，不要摸鱼啦！">-->
<!--            <template #description-->
<!--            ><p class="text-xs text-gray-500">2021-07-04 09:37:16</p></template-->
<!--            >-->
<!--          </n-thing>-->
<!--        </n-list-item>-->
<!--        <n-list-item>-->
<!--          <template #prefix>-->
<!--            <n-avatar circle :size="40" :src="schoolboy"/>-->
<!--          </template>-->
<!--          <n-thing title="上班不摸鱼，和咸鱼有什么区别（这话真不是我说的哈）！">-->
<!--            <template #description-->
<!--            ><p class="text-xs text-gray-500">2021-07-04 20:37:16</p></template-->
<!--            >-->
<!--          </n-thing>-->
<!--        </n-list-item>-->
<!--        <n-list-item>-->
<!--          <template #prefix>-->
<!--            <n-avatar circle :size="40" :src="schoolboy"/>-->
<!--          </template>-->
<!--          <n-thing title="页面切换其实也支持缓存，只是加了过度效果，看起来像是重新渲染了">-->
<!--            <template #description>-->
<!--              <p class="text-gray-400">-->
<!--                <n-input type="text" placeholder="不信，输点文字试试"/>-->
<!--              </p>-->
<!--            </template>-->
<!--          </n-thing>-->
<!--        </n-list-item>-->
      </n-list>
    </n-card>
  </div>
</template>

<script lang="ts" setup>
</script>

<style lang="less" scoped>
.project-card {
  margin-right: -6px;

  &-item {
    margin: -1px;
    width: 33.333333%;
  }
}
</style>